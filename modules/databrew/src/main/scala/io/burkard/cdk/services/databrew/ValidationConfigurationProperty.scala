package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ValidationConfigurationProperty {

  def apply(
    rulesetArn: String,
    validationMode: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty.Builder)
      .rulesetArn(rulesetArn)
      .validationMode(validationMode.orNull)
      .build()
}
