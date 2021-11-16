package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileDestination {

  def apply(
    objectKey: String,
    bucketName: String,
    assumeRoleArn: Option[String] = None,
    assumeRoleExternalId: Option[String] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.FileDestination =
    (new software.amazon.awscdk.cloudassembly.schema.FileDestination.Builder)
      .objectKey(objectKey)
      .bucketName(bucketName)
      .assumeRoleArn(assumeRoleArn.orNull)
      .assumeRoleExternalId(assumeRoleExternalId.orNull)
      .region(region.orNull)
      .build()
}
