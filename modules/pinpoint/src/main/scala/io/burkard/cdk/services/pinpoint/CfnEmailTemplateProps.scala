package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEmailTemplateProps {

  def apply(
    templateName: String,
    subject: String,
    tags: Option[AnyRef] = None,
    textPart: Option[String] = None,
    templateDescription: Option[String] = None,
    defaultSubstitutions: Option[String] = None,
    htmlPart: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps =
    (new software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps.Builder)
      .templateName(templateName)
      .subject(subject)
      .tags(tags.orNull)
      .textPart(textPart.orNull)
      .templateDescription(templateDescription.orNull)
      .defaultSubstitutions(defaultSubstitutions.orNull)
      .htmlPart(htmlPart.orNull)
      .build()
}
