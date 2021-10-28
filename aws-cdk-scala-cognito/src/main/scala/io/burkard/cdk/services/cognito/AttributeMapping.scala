package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AttributeMapping {

  def apply(
    familyName: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    website: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    givenName: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    email: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    lastUpdateTime: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    timezone: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    profilePicture: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    locale: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    birthdate: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    fullname: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    preferredUsername: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    custom: Option[Map[String, _ <: software.amazon.awscdk.services.cognito.ProviderAttribute]] = None,
    phoneNumber: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    middleName: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    profilePage: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    address: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    gender: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None,
    nickname: Option[software.amazon.awscdk.services.cognito.ProviderAttribute] = None
  ): software.amazon.awscdk.services.cognito.AttributeMapping =
    (new software.amazon.awscdk.services.cognito.AttributeMapping.Builder)
      .familyName(familyName.orNull)
      .website(website.orNull)
      .givenName(givenName.orNull)
      .email(email.orNull)
      .lastUpdateTime(lastUpdateTime.orNull)
      .timezone(timezone.orNull)
      .profilePicture(profilePicture.orNull)
      .locale(locale.orNull)
      .birthdate(birthdate.orNull)
      .fullname(fullname.orNull)
      .preferredUsername(preferredUsername.orNull)
      .custom(custom.map(_.asJava).orNull)
      .phoneNumber(phoneNumber.orNull)
      .middleName(middleName.orNull)
      .profilePage(profilePage.orNull)
      .address(address.orNull)
      .gender(gender.orNull)
      .nickname(nickname.orNull)
      .build()
}
