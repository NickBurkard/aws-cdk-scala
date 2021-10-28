package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BucketNotificationDestinationConfig {

  def apply(
    arn: Option[String] = None,
    `type`: Option[software.amazon.awscdk.services.s3.BucketNotificationDestinationType] = None,
    dependencies: Option[List[_ <: software.constructs.IDependable]] = None
  ): software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig =
    (new software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig.Builder)
      .arn(arn.orNull)
      .`type`(`type`.orNull)
      .dependencies(dependencies.map(_.asJava).orNull)
      .build()
}
