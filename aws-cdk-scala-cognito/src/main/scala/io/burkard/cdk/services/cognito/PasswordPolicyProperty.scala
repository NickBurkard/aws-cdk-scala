package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PasswordPolicyProperty {

  def apply(
    requireLowercase: Option[Boolean] = None,
    requireNumbers: Option[Boolean] = None,
    requireSymbols: Option[Boolean] = None,
    requireUppercase: Option[Boolean] = None,
    temporaryPasswordValidityDays: Option[Number] = None,
    minimumLength: Option[Number] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder)
      .requireLowercase(requireLowercase.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requireNumbers(requireNumbers.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requireSymbols(requireSymbols.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requireUppercase(requireUppercase.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .temporaryPasswordValidityDays(temporaryPasswordValidityDays.orNull)
      .minimumLength(minimumLength.orNull)
      .build()
}
