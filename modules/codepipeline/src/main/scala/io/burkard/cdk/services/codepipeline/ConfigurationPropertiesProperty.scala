package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfigurationPropertiesProperty {

  def apply(
    secret: Option[Boolean] = None,
    queryable: Option[Boolean] = None,
    name: Option[String] = None,
    description: Option[String] = None,
    key: Option[Boolean] = None,
    `type`: Option[String] = None,
    required: Option[Boolean] = None
  ): software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder)
      .secret(secret.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .queryable(queryable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .name(name.orNull)
      .description(description.orNull)
      .key(key.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .`type`(`type`.orNull)
      .required(required.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
