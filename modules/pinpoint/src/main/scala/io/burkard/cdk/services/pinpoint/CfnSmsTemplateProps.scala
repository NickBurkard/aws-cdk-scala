package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSmsTemplateProps {

  def apply(
    body: Option[String] = None,
    templateDescription: Option[String] = None,
    defaultSubstitutions: Option[String] = None,
    tags: Option[AnyRef] = None,
    templateName: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps =
    (new software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps.Builder)
      .body(body.orNull)
      .templateDescription(templateDescription.orNull)
      .defaultSubstitutions(defaultSubstitutions.orNull)
      .tags(tags.orNull)
      .templateName(templateName.orNull)
      .build()
}
