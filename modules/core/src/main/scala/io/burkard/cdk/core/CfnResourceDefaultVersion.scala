package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceDefaultVersion {

  def apply(
    internalResourceId: String,
    versionId: Option[String] = None,
    typeName: Option[String] = None,
    typeVersionArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnResourceDefaultVersion =
    software.amazon.awscdk.CfnResourceDefaultVersion.Builder
      .create(stackCtx, internalResourceId)
      .versionId(versionId.orNull)
      .typeName(typeName.orNull)
      .typeVersionArn(typeVersionArn.orNull)
      .build()
}
