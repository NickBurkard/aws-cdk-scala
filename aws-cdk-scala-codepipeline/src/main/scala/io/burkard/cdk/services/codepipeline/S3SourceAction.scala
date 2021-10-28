package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3SourceAction {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    bucketKey: Option[String] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    trigger: Option[software.amazon.awscdk.services.codepipeline.actions.S3Trigger] = None
  ): software.amazon.awscdk.services.codepipeline.actions.S3SourceAction =
    software.amazon.awscdk.services.codepipeline.actions.S3SourceAction.Builder
      .create()
      .role(role.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .bucket(bucket.orNull)
      .bucketKey(bucketKey.orNull)
      .output(output.orNull)
      .trigger(trigger.orNull)
      .build()
}
