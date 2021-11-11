package io.burkard.cdk.services.cognito

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StandardAttributes {

  def apply(
    familyName: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    website: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    givenName: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    emailVerified: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    email: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    lastUpdateTime: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    profilePicture: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    locale: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    birthdate: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    fullname: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    preferredUsername: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    phoneNumber: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    middleName: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    phoneNumberVerified: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    timezone: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    profilePage: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    address: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    gender: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None,
    nickname: Option[software.amazon.awscdk.services.cognito.StandardAttribute] = None
  ): software.amazon.awscdk.services.cognito.StandardAttributes =
    (new software.amazon.awscdk.services.cognito.StandardAttributes.Builder)
      .familyName(familyName.orNull)
      .website(website.orNull)
      .givenName(givenName.orNull)
      .emailVerified(emailVerified.orNull)
      .email(email.orNull)
      .lastUpdateTime(lastUpdateTime.orNull)
      .profilePicture(profilePicture.orNull)
      .locale(locale.orNull)
      .birthdate(birthdate.orNull)
      .fullname(fullname.orNull)
      .preferredUsername(preferredUsername.orNull)
      .phoneNumber(phoneNumber.orNull)
      .middleName(middleName.orNull)
      .phoneNumberVerified(phoneNumberVerified.orNull)
      .timezone(timezone.orNull)
      .profilePage(profilePage.orNull)
      .address(address.orNull)
      .gender(gender.orNull)
      .nickname(nickname.orNull)
      .build()
}
