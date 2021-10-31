package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
