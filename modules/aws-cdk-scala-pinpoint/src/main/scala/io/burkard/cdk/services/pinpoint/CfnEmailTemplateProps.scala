package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEmailTemplateProps {

  def apply(
    tags: Option[AnyRef] = None,
    templateName: Option[String] = None,
    subject: Option[String] = None,
    textPart: Option[String] = None,
    templateDescription: Option[String] = None,
    defaultSubstitutions: Option[String] = None,
    htmlPart: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps =
    (new software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps.Builder)
      .tags(tags.orNull)
      .templateName(templateName.orNull)
      .subject(subject.orNull)
      .textPart(textPart.orNull)
      .templateDescription(templateDescription.orNull)
      .defaultSubstitutions(defaultSubstitutions.orNull)
      .htmlPart(htmlPart.orNull)
      .build()
}
