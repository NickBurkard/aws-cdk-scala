package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3KeyFilterProperty {

  def apply(
    rules: List[_]
  ): software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty.Builder)
      .rules(rules.asJava)
      .build()
}
