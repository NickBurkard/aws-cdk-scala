package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceDefaultVersion {

  def apply(
    internalResourceId: String,
    versionId: Option[String] = None,
    typeName: Option[String] = None,
    typeVersionArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion =
    software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion.Builder
      .create(stackCtx, internalResourceId)
      .versionId(versionId.orNull)
      .typeName(typeName.orNull)
      .typeVersionArn(typeVersionArn.orNull)
      .build()
}
