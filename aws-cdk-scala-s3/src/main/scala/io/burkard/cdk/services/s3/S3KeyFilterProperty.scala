package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3KeyFilterProperty {

  def apply(
    rules: Option[List[_]] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty.Builder)
      .rules(rules.map(_.asJava).orNull)
      .build()
}
