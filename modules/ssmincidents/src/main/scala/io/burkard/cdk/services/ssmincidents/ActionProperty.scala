package io.burkard.cdk.services.ssmincidents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionProperty {

  def apply(
    ssmAutomation: Option[software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty] = None
  ): software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty =
    (new software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty.Builder)
      .ssmAutomation(ssmAutomation.orNull)
      .build()
}
