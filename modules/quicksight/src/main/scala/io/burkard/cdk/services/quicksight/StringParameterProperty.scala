package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StringParameterProperty {

  def apply(
    name: String,
    values: List[String]
  ): software.amazon.awscdk.services.quicksight.CfnAnalysis.StringParameterProperty =
    (new software.amazon.awscdk.services.quicksight.CfnAnalysis.StringParameterProperty.Builder)
      .name(name)
      .values(values.asJava)
      .build()
}
