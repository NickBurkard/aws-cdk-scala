package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomActionProperty {

  def apply(
    name: String,
    required: Boolean,
    secret: Option[Boolean] = None,
    queryable: Option[Boolean] = None,
    description: Option[String] = None,
    key: Option[Boolean] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.CustomActionProperty =
    (new software.amazon.awscdk.services.codepipeline.CustomActionProperty.Builder)
      .name(name)
      .required(required)
      .secret(secret.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .queryable(queryable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .key(key.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .`type`(`type`.orNull)
      .build()
}
