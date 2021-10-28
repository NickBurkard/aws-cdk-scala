package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ElasticFileSystemTagProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty =
    (new software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
