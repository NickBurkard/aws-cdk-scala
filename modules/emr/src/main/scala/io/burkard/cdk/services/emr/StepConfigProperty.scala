package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepConfigProperty {

  def apply(
    name: String,
    hadoopJarStep: software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty,
    actionOnFailure: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.Builder)
      .name(name)
      .hadoopJarStep(hadoopJarStep)
      .actionOnFailure(actionOnFailure.orNull)
      .build()
}
