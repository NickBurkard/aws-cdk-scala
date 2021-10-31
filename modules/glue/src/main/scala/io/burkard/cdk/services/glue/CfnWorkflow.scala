package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWorkflow {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    defaultRunProperties: Option[AnyRef] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnWorkflow =
    software.amazon.awscdk.services.glue.CfnWorkflow.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .defaultRunProperties(defaultRunProperties.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .build()
}
