package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StepConfigProperty {

  def apply(
    name: Option[String] = None,
    hadoopJarStep: Option[software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty] = None,
    actionOnFailure: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.Builder)
      .name(name.orNull)
      .hadoopJarStep(hadoopJarStep.orNull)
      .actionOnFailure(actionOnFailure.orNull)
      .build()
}
