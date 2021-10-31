package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OptionGroupProps {

  def apply(
    description: Option[String] = None,
    configurations: Option[List[_ <: software.amazon.awscdk.services.rds.OptionConfiguration]] = None,
    engine: Option[software.amazon.awscdk.services.rds.IInstanceEngine] = None
  ): software.amazon.awscdk.services.rds.OptionGroupProps =
    (new software.amazon.awscdk.services.rds.OptionGroupProps.Builder)
      .description(description.orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .engine(engine.orNull)
      .build()
}
