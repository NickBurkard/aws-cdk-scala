package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfigurationPropertiesProperty {

  def apply(
    secret: Boolean,
    name: String,
    key: Boolean,
    required: Boolean,
    queryable: Option[Boolean] = None,
    description: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder)
      .secret(secret)
      .name(name)
      .key(key)
      .required(required)
      .queryable(queryable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .`type`(`type`.orNull)
      .build()
}
