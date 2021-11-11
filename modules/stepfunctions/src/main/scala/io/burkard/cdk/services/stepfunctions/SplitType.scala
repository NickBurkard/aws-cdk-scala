package io.burkard.cdk.services.stepfunctions

sealed abstract class SplitType(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.SplitType)
  extends Product
    with Serializable

object SplitType {
  implicit def toAws(value: SplitType): software.amazon.awscdk.services.stepfunctions.tasks.SplitType =
    Option(value).map(_.underlying).orNull

  case object None
    extends SplitType(software.amazon.awscdk.services.stepfunctions.tasks.SplitType.NONE)

  case object Line
    extends SplitType(software.amazon.awscdk.services.stepfunctions.tasks.SplitType.LINE)

  case object RecordIo
    extends SplitType(software.amazon.awscdk.services.stepfunctions.tasks.SplitType.RECORD_IO)

  case object TfRecord
    extends SplitType(software.amazon.awscdk.services.stepfunctions.tasks.SplitType.TF_RECORD)
}
