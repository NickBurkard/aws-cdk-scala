package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ElasticFileSystemTagProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty =
    (new software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
