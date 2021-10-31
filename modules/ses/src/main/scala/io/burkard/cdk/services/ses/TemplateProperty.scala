package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TemplateProperty {

  def apply(
    textPart: Option[String] = None,
    templateName: Option[String] = None,
    htmlPart: Option[String] = None,
    subjectPart: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty =
    (new software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty.Builder)
      .textPart(textPart.orNull)
      .templateName(templateName.orNull)
      .htmlPart(htmlPart.orNull)
      .subjectPart(subjectPart.orNull)
      .build()
}
