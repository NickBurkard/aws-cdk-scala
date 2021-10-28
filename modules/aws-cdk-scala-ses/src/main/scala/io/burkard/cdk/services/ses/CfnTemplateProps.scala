package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTemplateProps {

  def apply(
    template: Option[software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty] = None
  ): software.amazon.awscdk.services.ses.CfnTemplateProps =
    (new software.amazon.awscdk.services.ses.CfnTemplateProps.Builder)
      .template(template.orNull)
      .build()
}
