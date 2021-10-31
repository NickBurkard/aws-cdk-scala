package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3KeyFilterProperty {

  def apply(
    rules: Option[List[_]] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty.Builder)
      .rules(rules.map(_.asJava).orNull)
      .build()
}
