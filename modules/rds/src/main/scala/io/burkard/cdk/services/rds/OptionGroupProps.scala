package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OptionGroupProps {

  def apply(
    configurations: List[_ <: software.amazon.awscdk.services.rds.OptionConfiguration],
    engine: software.amazon.awscdk.services.rds.IInstanceEngine,
    description: Option[String] = None
  ): software.amazon.awscdk.services.rds.OptionGroupProps =
    (new software.amazon.awscdk.services.rds.OptionGroupProps.Builder)
      .configurations(configurations.asJava)
      .engine(engine)
      .description(description.orNull)
      .build()
}
