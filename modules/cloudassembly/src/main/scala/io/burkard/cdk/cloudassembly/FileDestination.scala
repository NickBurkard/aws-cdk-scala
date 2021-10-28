package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FileDestination {

  def apply(
    objectKey: Option[String] = None,
    assumeRoleArn: Option[String] = None,
    assumeRoleExternalId: Option[String] = None,
    region: Option[String] = None,
    bucketName: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.FileDestination =
    (new software.amazon.awscdk.cloudassembly.schema.FileDestination.Builder)
      .objectKey(objectKey.orNull)
      .assumeRoleArn(assumeRoleArn.orNull)
      .assumeRoleExternalId(assumeRoleExternalId.orNull)
      .region(region.orNull)
      .bucketName(bucketName.orNull)
      .build()
}
