package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSmsTemplateProps {

  def apply(
    body: String,
    templateName: String,
    templateDescription: Option[String] = None,
    defaultSubstitutions: Option[String] = None,
    tags: Option[AnyRef] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps =
    (new software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps.Builder)
      .body(body)
      .templateName(templateName)
      .templateDescription(templateDescription.orNull)
      .defaultSubstitutions(defaultSubstitutions.orNull)
      .tags(tags.orNull)
      .build()
}
