package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStepProps {

  def apply(
    name: String,
    hadoopJarStep: software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty,
    actionOnFailure: String,
    jobFlowId: String
  ): software.amazon.awscdk.services.emr.CfnStepProps =
    (new software.amazon.awscdk.services.emr.CfnStepProps.Builder)
      .name(name)
      .hadoopJarStep(hadoopJarStep)
      .actionOnFailure(actionOnFailure)
      .jobFlowId(jobFlowId)
      .build()
}
