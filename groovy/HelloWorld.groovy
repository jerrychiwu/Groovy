@RestController
class HelloWorld {
  @RequestMapping("/")
  String hello() {
    "Hello World !!!"
  }

  @RequestMapping(value = "/name", method = RequestMethod.GET)
  String hello2() {
    "Hello World Jerry !!!"
  }
}