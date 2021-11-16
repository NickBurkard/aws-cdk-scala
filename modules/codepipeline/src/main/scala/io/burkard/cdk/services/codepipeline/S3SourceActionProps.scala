package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3SourceActionProps {

  def apply(
    bucket: software.amazon.awscdk.services.s3.IBucket,
    bucketKey: String,
    output: software.amazon.awscdk.services.codepipeline.Artifact,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    trigger: Option[software.amazon.awscdk.services.codepipeline.actions.S3Trigger] = None
  ): software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps.Builder)
      .bucket(bucket)
      .bucketKey(bucketKey)
      .output(output)
      .role(role.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .trigger(trigger.orNull)
      .build()
}
