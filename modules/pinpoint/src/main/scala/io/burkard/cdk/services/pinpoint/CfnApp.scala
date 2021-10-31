package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApp {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnApp =
    software.amazon.awscdk.services.pinpoint.CfnApp.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.orNull)
      .build()
}
