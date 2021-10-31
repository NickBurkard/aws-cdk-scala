package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StandardAttributesMask {

  def apply(
    familyName: Option[Boolean] = None,
    website: Option[Boolean] = None,
    givenName: Option[Boolean] = None,
    emailVerified: Option[Boolean] = None,
    email: Option[Boolean] = None,
    lastUpdateTime: Option[Boolean] = None,
    profilePicture: Option[Boolean] = None,
    locale: Option[Boolean] = None,
    birthdate: Option[Boolean] = None,
    fullname: Option[Boolean] = None,
    preferredUsername: Option[Boolean] = None,
    phoneNumber: Option[Boolean] = None,
    middleName: Option[Boolean] = None,
    phoneNumberVerified: Option[Boolean] = None,
    timezone: Option[Boolean] = None,
    profilePage: Option[Boolean] = None,
    address: Option[Boolean] = None,
    gender: Option[Boolean] = None,
    nickname: Option[Boolean] = None
  ): software.amazon.awscdk.services.cognito.StandardAttributesMask =
    (new software.amazon.awscdk.services.cognito.StandardAttributesMask.Builder)
      .familyName(familyName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .website(website.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .givenName(givenName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .emailVerified(emailVerified.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .email(email.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .lastUpdateTime(lastUpdateTime.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .profilePicture(profilePicture.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .locale(locale.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .birthdate(birthdate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .fullname(fullname.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .preferredUsername(preferredUsername.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .phoneNumber(phoneNumber.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .middleName(middleName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .phoneNumberVerified(phoneNumberVerified.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .timezone(timezone.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .profilePage(profilePage.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .address(address.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .gender(gender.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .nickname(nickname.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
