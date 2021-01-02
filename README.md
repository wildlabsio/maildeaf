# 📤 MailDeaf
MailDeaf provides an abstract mail service.

## MailSender
Feel free to implement your own MailSender. You only have to implement the MailSender interface.
The following MailSender are implemented right now.

### **SendGridMailSender**
https://github.com/wildlabsio/maildeaf/tree/master/maildeaf-sender-sendgrid

### **ChainMailSender**
ChainMailSender have a list of other MailSender.

### **ProxyMailSender**
You can change to parameter of Mail. For example for send all emails to specific email in dev environment.

## Authors
**[Pascal Wild](https://github.com/pascalwild)**

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
