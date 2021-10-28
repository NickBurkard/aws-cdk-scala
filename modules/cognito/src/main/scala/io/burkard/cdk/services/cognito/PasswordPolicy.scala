package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PasswordPolicy {

  def apply(
    requireLowercase: Option[Boolean] = None,
    requireDigits: Option[Boolean] = None,
    requireSymbols: Option[Boolean] = None,
    tempPasswordValidity: Option[software.amazon.awscdk.Duration] = None,
    requireUppercase: Option[Boolean] = None,
    minLength: Option[Number] = None
  ): software.amazon.awscdk.services.cognito.PasswordPolicy =
    (new software.amazon.awscdk.services.cognito.PasswordPolicy.Builder)
      .requireLowercase(requireLowercase.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requireDigits(requireDigits.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requireSymbols(requireSymbols.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tempPasswordValidity(tempPasswordValidity.orNull)
      .requireUppercase(requireUppercase.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .minLength(minLength.orNull)
      .build()
}
