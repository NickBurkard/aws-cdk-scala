package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3PathProperty {

  def apply(
    key: String,
    bucket: String
  ): software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty.Builder)
      .key(key)
      .bucket(bucket)
      .build()
}
