package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEmailTemplate {

  def apply(
    internalResourceId: String,
    templateName: String,
    subject: String,
    tags: Option[AnyRef] = None,
    textPart: Option[String] = None,
    templateDescription: Option[String] = None,
    defaultSubstitutions: Option[String] = None,
    htmlPart: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnEmailTemplate =
    software.amazon.awscdk.services.pinpoint.CfnEmailTemplate.Builder
      .create(stackCtx, internalResourceId)
      .templateName(templateName)
      .subject(subject)
      .tags(tags.orNull)
      .textPart(textPart.orNull)
      .templateDescription(templateDescription.orNull)
      .defaultSubstitutions(defaultSubstitutions.orNull)
      .htmlPart(htmlPart.orNull)
      .build()
}
