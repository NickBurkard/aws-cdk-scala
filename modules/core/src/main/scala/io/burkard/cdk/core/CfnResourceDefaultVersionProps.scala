package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceDefaultVersionProps {

  def apply(
    versionId: Option[String] = None,
    typeName: Option[String] = None,
    typeVersionArn: Option[String] = None
  ): software.amazon.awscdk.CfnResourceDefaultVersionProps =
    (new software.amazon.awscdk.CfnResourceDefaultVersionProps.Builder)
      .versionId(versionId.orNull)
      .typeName(typeName.orNull)
      .typeVersionArn(typeVersionArn.orNull)
      .build()
}
