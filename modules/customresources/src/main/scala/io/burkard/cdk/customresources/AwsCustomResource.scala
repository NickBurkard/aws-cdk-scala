package io.burkard.cdk.customresources

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsCustomResource {

  def apply(
    internalResourceId: String,
    policy: software.amazon.awscdk.customresources.AwsCustomResourcePolicy,
    logRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    functionName: Option[String] = None,
    resourceType: Option[String] = None,
    onCreate: Option[software.amazon.awscdk.customresources.AwsSdkCall] = None,
    onUpdate: Option[software.amazon.awscdk.customresources.AwsSdkCall] = None,
    installLatestAwsSdk: Option[Boolean] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    onDelete: Option[software.amazon.awscdk.customresources.AwsSdkCall] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.customresources.AwsCustomResource =
    software.amazon.awscdk.customresources.AwsCustomResource.Builder
      .create(stackCtx, internalResourceId)
      .policy(policy)
      .logRetention(logRetention.orNull)
      .functionName(functionName.orNull)
      .resourceType(resourceType.orNull)
      .onCreate(onCreate.orNull)
      .onUpdate(onUpdate.orNull)
      .installLatestAwsSdk(installLatestAwsSdk.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .timeout(timeout.orNull)
      .role(role.orNull)
      .onDelete(onDelete.orNull)
      .build()
}
