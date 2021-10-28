package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsDestination {

  def apply(
    assumeRoleArn: Option[String] = None,
    assumeRoleExternalId: Option[String] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.AwsDestination =
    (new software.amazon.awscdk.cloudassembly.schema.AwsDestination.Builder)
      .assumeRoleArn(assumeRoleArn.orNull)
      .assumeRoleExternalId(assumeRoleExternalId.orNull)
      .region(region.orNull)
      .build()
}
