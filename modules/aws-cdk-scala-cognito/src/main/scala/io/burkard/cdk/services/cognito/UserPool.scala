package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserPool {

  def apply(
    internalResourceId: String,
    autoVerify: Option[software.amazon.awscdk.services.cognito.AutoVerifiedAttrs] = None,
    userVerification: Option[software.amazon.awscdk.services.cognito.UserVerificationConfig] = None,
    passwordPolicy: Option[software.amazon.awscdk.services.cognito.PasswordPolicy] = None,
    mfaMessage: Option[String] = None,
    enableSmsRole: Option[Boolean] = None,
    signInCaseSensitive: Option[Boolean] = None,
    accountRecovery: Option[software.amazon.awscdk.services.cognito.AccountRecovery] = None,
    mfa: Option[software.amazon.awscdk.services.cognito.Mfa] = None,
    smsRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    customAttributes: Option[Map[String, _ <: software.amazon.awscdk.services.cognito.ICustomAttribute]] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    standardAttributes: Option[software.amazon.awscdk.services.cognito.StandardAttributes] = None,
    mfaSecondFactor: Option[software.amazon.awscdk.services.cognito.MfaSecondFactor] = None,
    emailSettings: Option[software.amazon.awscdk.services.cognito.EmailSettings] = None,
    smsRoleExternalId: Option[String] = None,
    userInvitation: Option[software.amazon.awscdk.services.cognito.UserInvitationConfig] = None,
    userPoolName: Option[String] = None,
    signInAliases: Option[software.amazon.awscdk.services.cognito.SignInAliases] = None,
    lambdaTriggers: Option[software.amazon.awscdk.services.cognito.UserPoolTriggers] = None,
    deviceTracking: Option[software.amazon.awscdk.services.cognito.DeviceTracking] = None,
    selfSignUpEnabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.UserPool =
    software.amazon.awscdk.services.cognito.UserPool.Builder
      .create(stackCtx, internalResourceId)
      .autoVerify(autoVerify.orNull)
      .userVerification(userVerification.orNull)
      .passwordPolicy(passwordPolicy.orNull)
      .mfaMessage(mfaMessage.orNull)
      .enableSmsRole(enableSmsRole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .signInCaseSensitive(signInCaseSensitive.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .accountRecovery(accountRecovery.orNull)
      .mfa(mfa.orNull)
      .smsRole(smsRole.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .removalPolicy(removalPolicy.orNull)
      .standardAttributes(standardAttributes.orNull)
      .mfaSecondFactor(mfaSecondFactor.orNull)
      .emailSettings(emailSettings.orNull)
      .smsRoleExternalId(smsRoleExternalId.orNull)
      .userInvitation(userInvitation.orNull)
      .userPoolName(userPoolName.orNull)
      .signInAliases(signInAliases.orNull)
      .lambdaTriggers(lambdaTriggers.orNull)
      .deviceTracking(deviceTracking.orNull)
      .selfSignUpEnabled(selfSignUpEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
