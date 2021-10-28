package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStep {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    hadoopJarStep: Option[software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty] = None,
    actionOnFailure: Option[String] = None,
    jobFlowId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.emr.CfnStep =
    software.amazon.awscdk.services.emr.CfnStep.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .hadoopJarStep(hadoopJarStep.orNull)
      .actionOnFailure(actionOnFailure.orNull)
      .jobFlowId(jobFlowId.orNull)
      .build()
}
