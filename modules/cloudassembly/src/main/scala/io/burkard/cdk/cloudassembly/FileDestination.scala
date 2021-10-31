package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
