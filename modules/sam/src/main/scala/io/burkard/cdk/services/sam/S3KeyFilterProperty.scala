package io.burkard.cdk.services.sam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3KeyFilterProperty {

  def apply(
    rules: Option[List[_]] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty.Builder)
      .rules(rules.map(_.asJava).orNull)
      .build()
}
