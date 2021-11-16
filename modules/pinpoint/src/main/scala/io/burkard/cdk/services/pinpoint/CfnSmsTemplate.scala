package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSmsTemplate {

  def apply(
    internalResourceId: String,
    body: String,
    templateName: String,
    templateDescription: Option[String] = None,
    defaultSubstitutions: Option[String] = None,
    tags: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnSmsTemplate =
    software.amazon.awscdk.services.pinpoint.CfnSmsTemplate.Builder
      .create(stackCtx, internalResourceId)
      .body(body)
      .templateName(templateName)
      .templateDescription(templateDescription.orNull)
      .defaultSubstitutions(defaultSubstitutions.orNull)
      .tags(tags.orNull)
      .build()
}
