package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStep {

  def apply(
    internalResourceId: String,
    name: String,
    hadoopJarStep: software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty,
    actionOnFailure: String,
    jobFlowId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.emr.CfnStep =
    software.amazon.awscdk.services.emr.CfnStep.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .hadoopJarStep(hadoopJarStep)
      .actionOnFailure(actionOnFailure)
      .jobFlowId(jobFlowId)
      .build()
}
