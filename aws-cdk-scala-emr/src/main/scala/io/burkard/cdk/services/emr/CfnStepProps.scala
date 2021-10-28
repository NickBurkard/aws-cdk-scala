package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStepProps {

  def apply(
    name: Option[String] = None,
    hadoopJarStep: Option[software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty] = None,
    actionOnFailure: Option[String] = None,
    jobFlowId: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnStepProps =
    (new software.amazon.awscdk.services.emr.CfnStepProps.Builder)
      .name(name.orNull)
      .hadoopJarStep(hadoopJarStep.orNull)
      .actionOnFailure(actionOnFailure.orNull)
      .jobFlowId(jobFlowId.orNull)
      .build()
}
