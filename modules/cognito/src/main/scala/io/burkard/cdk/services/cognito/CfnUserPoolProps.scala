package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolProps {

  def apply(
    aliasAttributes: Option[List[String]] = None,
    userPoolAddOns: Option[software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty] = None,
    smsAuthenticationMessage: Option[String] = None,
    autoVerifiedAttributes: Option[List[String]] = None,
    usernameAttributes: Option[List[String]] = None,
    userPoolTags: Option[AnyRef] = None,
    usernameConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPool.UsernameConfigurationProperty] = None,
    emailVerificationSubject: Option[String] = None,
    mfaConfiguration: Option[String] = None,
    userPoolName: Option[String] = None,
    emailConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty] = None,
    lambdaConfig: Option[software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty] = None,
    policies: Option[software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty] = None,
    smsConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty] = None,
    accountRecoverySetting: Option[software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty] = None,
    smsVerificationMessage: Option[String] = None,
    emailVerificationMessage: Option[String] = None,
    deviceConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty] = None,
    enabledMfas: Option[List[String]] = None,
    schema: Option[List[_]] = None,
    verificationMessageTemplate: Option[software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty] = None,
    adminCreateUserConfig: Option[software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder)
      .aliasAttributes(aliasAttributes.map(_.asJava).orNull)
      .userPoolAddOns(userPoolAddOns.orNull)
      .smsAuthenticationMessage(smsAuthenticationMessage.orNull)
      .autoVerifiedAttributes(autoVerifiedAttributes.map(_.asJava).orNull)
      .usernameAttributes(usernameAttributes.map(_.asJava).orNull)
      .userPoolTags(userPoolTags.orNull)
      .usernameConfiguration(usernameConfiguration.orNull)
      .emailVerificationSubject(emailVerificationSubject.orNull)
      .mfaConfiguration(mfaConfiguration.orNull)
      .userPoolName(userPoolName.orNull)
      .emailConfiguration(emailConfiguration.orNull)
      .lambdaConfig(lambdaConfig.orNull)
      .policies(policies.orNull)
      .smsConfiguration(smsConfiguration.orNull)
      .accountRecoverySetting(accountRecoverySetting.orNull)
      .smsVerificationMessage(smsVerificationMessage.orNull)
      .emailVerificationMessage(emailVerificationMessage.orNull)
      .deviceConfiguration(deviceConfiguration.orNull)
      .enabledMfas(enabledMfas.map(_.asJava).orNull)
      .schema(schema.map(_.asJava).orNull)
      .verificationMessageTemplate(verificationMessageTemplate.orNull)
      .adminCreateUserConfig(adminCreateUserConfig.orNull)
      .build()
}
