chrome.runtime.onInstalled.addListener(() => {
  chrome.storage.sync.set({ color });
  console.log("Default background color set to %cgreen", `color: ${color}`);
});

function getword(info) {
  if (info.menuItemId !== "word") {
    return;
  }
  chrome.tabs.create({
    url: `http://192.168.3.31:8081/?q=${info.selectionText}&save=true`,
  });
}
chrome.contextMenus.create({
  title: "查单词: %s",
  contexts: ["selection"],
  id: "word",
});

chrome.contextMenus.onClicked.addListener(getword);
