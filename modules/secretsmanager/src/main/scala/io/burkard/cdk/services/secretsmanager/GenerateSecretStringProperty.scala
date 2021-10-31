package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GenerateSecretStringProperty {

  def apply(
    secretStringTemplate: Option[String] = None,
    includeSpace: Option[Boolean] = None,
    excludeLowercase: Option[Boolean] = None,
    excludeCharacters: Option[String] = None,
    generateStringKey: Option[String] = None,
    excludeNumbers: Option[Boolean] = None,
    excludeUppercase: Option[Boolean] = None,
    requireEachIncludedType: Option[Boolean] = None,
    excludePunctuation: Option[Boolean] = None,
    passwordLength: Option[Number] = None
  ): software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty =
    (new software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder)
      .secretStringTemplate(secretStringTemplate.orNull)
      .includeSpace(includeSpace.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .excludeLowercase(excludeLowercase.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .excludeCharacters(excludeCharacters.orNull)
      .generateStringKey(generateStringKey.orNull)
      .excludeNumbers(excludeNumbers.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .excludeUppercase(excludeUppercase.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requireEachIncludedType(requireEachIncludedType.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .excludePunctuation(excludePunctuation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .passwordLength(passwordLength.orNull)
      .build()
}
